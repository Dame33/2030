package Lab4;


/**
 * This class defines a 3D vector
 * @author EECS2030 
 *
 */
public class Lab4Vector3D {
	// define instance variables here 
	private double x;
	private double y;
	private double z;

	
	/**
     * Creates the vector <code>(0.0, 0.0, 0.0)</code>.
     * This is the default constructor.
     */
	public Lab4Vector3D() {
		this.x = 0.0 ;
		this.y = 0.0 ;
		this.z = 0.0 ;
	}
	
	
	
    /**
     * Creates the vector <code>(x, y, z)</code>.
     * @param x is the x-component of the vector       
     * @param y is the y-component of the vector
     * @param z is the z-component of the vector        
     */
	public Lab4Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
    /**
     * Creates a vector with the same components as another vector.
     * This is the copy constructor.
     * @param other  is a vector used to copy the components from
     */
	public Lab4Vector3D(Lab4Vector3D other) {
		this.x = other.x;
		this.y = other.y;
		this.z = other.z;
	}

	
	
    /**
     * Returns the x component of the vector.
     * @return the x component of the vector.
     */
	public double getX() {
		return this.x;
	}
	
	
    /**
     * Sets the x component of the vector.
     * @param x the new value of the x component.
     */
	public void setX(double x) {
		this.x = x;
	}
	
    /**
     * Returns the y component of the vector.
     * @return the y component of the vector.
     */
	public double getY() {
		return this.y;
	}

	
	/**
     * Sets the y component of the vector.
     * @param y the new value of the y component.
     */
	public void setY(double y){
		this.y = y;
	}

	
	
	/**
     * Returns the z component of the vector.
     * @return the z component of the vector.
     */
	public double getZ() {
		return this.z;
	}
	
	
    /**
     * Sets the z component of the vector.
     * @param z the new value of the z component.
     */
	public void setZ(double z) {
		this.z = z;
	}
 

    /**
     * Adds a vector to this vector and changes the components of this vector.
     * To add, the counterpart components are added together.
     * @param other is the vector that is added to this vector.
     * @return the current <code>Vector3D</code> object
     */
	public Lab4Vector3D add(Lab4Vector3D other) {
		this.x += other.x;
		this.y += other.y;
		this.z += other.z;
		return this;
	}
	
	

    /**
     * Subtracts a vector from this vector and changes the components of this vector.
     * To subtract, the counterpart components are subtracted.
     * @param other is the vector that is subtracted from this vector.
     * @return this <code>Vector3D</code> object
     */
	public Lab4Vector3D subtract(Lab4Vector3D other) {
		this.x -= other.x;
		this.y -= other.y;
		this.z -= other.z;
		return this;
	}
	
	
	
	/**
     * Multiplies this vector by a scalar.
     * @param scalar is the scalar that is multiplied by this vector
     * @return this vector after multiplication
     */
	public Lab4Vector3D scalarMultiplication(double scalar) {
		this.x *= scalar;
		this.y *= scalar;
		this.z *= scalar;
		return this;
	}
 
	

    /**
     * computes the DOT product of this vector and the given vector
     * @param other is the given vector, whose DOT product with this vector is given
     * @return the DOT product of this and the other vector.
     */
	public double dotProduct(Lab4Vector3D other) {
		return this.x * other.x + this.y * other.y + this.z * other.z;
	}
	
	

    /**
     * Computes the magnitude of this vector.
     * @return the magnitude of this vector.
     */
	public double magnitude() {
	    return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)+Math.pow(this.z, 2));
	}
	
    /**
     * Returns a string representation of the vector as [x, y, z], 
     * where x, y and z are the components of the vector. 
     * @return a string representation of the vector
     */
	public String toString() {
		 return "[" + this.x + ", " + this.y + ", " + this.z + "]";
	}
	
	
	
    /**
     * Determines if the difference between the magnitude of this vector and the other vector
     * is smaller than the given threshold.  
     * @param other the other vector that is compared with this vector
     * @param threshold a positive double, which shows the accepted magnitude difference between the two vectors
     * @return <code>true</code> if the difference between magnitude of the 
     * two vectors is less than <code> threshold</code> and <code>false</code> otherwise
     */
     public boolean equalTo (Lab4Vector3D other, double threshold) {
    	 return Math.abs(this.magnitude() - other.magnitude()) < threshold;
     }
}
/**
 * This class makes use of vector 3D, 
 * to solve a space mission problem.
 */
class SpaceMission {
	private Lab4Vector3D currentPosition;
	private double x;
	private double y;
	private double z;
	// define the instance variable and any constructor required.

    /**
     * This is the constructor of SpaceMission
     * @param initialX : is the x component of the current position 
     * @param initialY : is the y component of the current position 
     * @param initialZ : is the z component of the current position 
     */
	public SpaceMission(double initialX, double initialY, double initialZ) {
		 this.currentPosition = new Lab4Vector3D(initialX, initialY, initialZ);	}
    
    /** 
     * it's a getter for the current position
     * @return it returns the current position. 
     */
	public Lab4Vector3D getCurrentPosition() {
		return this.currentPosition;
		
	}

    
    /**
     * Finds the distance between two vectors, the current position and 
     * another vector.
     * @param other : is the vector to which the distance from the current position is calculated. 
     * @return The distance between the current position and the given vector. 
     */
	public double distanceTo(Lab4Vector3D other) {
		return Math.sqrt(Math.pow(currentPosition.getX() - other.getX(), 2) + Math.pow(currentPosition.getY() - other.getY(), 2)+ Math.pow(currentPosition.getZ() - other.getZ(), 2));
	}
	
	
	
    /**
     * This method increases the length of the vector by the factor of fuelAmount, using 
     * scalar multiplication of vectors. 
     * @param fuelAmount: is a factor by which all the components of the vector are increased. 
     */
	
	public void refuel(double fuelAmount) {
		this.currentPosition = currentPosition.scalarMultiplication(fuelAmount);
		return;
	}

    /**
     * Takes a Vector3D objects representing a celestial body
     * that you would reposition to. However, it first ensures that the 
     * destination between the current position and the celestial body is less than 
     * the given threshold, otherwise it keeps refuel the the current position before repositioning. 
     * @param destination : is the vector representing the position of a celestial body to which we are moving.
     * @param threshold :the distance between the current position and the destination must be less 
     * than this threshold to enable us to reposition. 
     * @param refuelAmount : is the amount by which the components of the vector is increased in order to decrease the distance between the current position and the destination.  
     */
	public void navigate(Lab4Vector3D destination, double threshold, double refuelAmount) {
		if (distanceTo(destination) >= threshold) {
			this.currentPosition = destination;
		}
		else {
			refuel(refuelAmount);
		}
		
	}

}