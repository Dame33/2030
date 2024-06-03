package lab0;


/**
 * Objective: CLO 2 : testing
 *
 */

public class Lab0 {
	/**
	 * This method returns the student ID
	 * @return returns the  students number, which should be 9 digits long
	 */
	public static String getMyID(){
		;
		return "219791185";
	}
	/**
	 * This method gets a decimal grade value and returns its corresponding letter grade value.
	 * @param grade is a double number that represent a grade
	 * @return returns a letter grade equivalent of the input grade.
	 * @pre. The input grade is a double number between zero and 100 inclusive. 
	 */
 
	public static String getLetterGrade(double grade) {
		if (grade >= 90) {
			return "A+";
		}
		else if ( 90 > grade && grade >= 80 ) {
			return "A";
		}
		else if ( 80 > grade && grade >= 75 ) {
			return "B+";
		}
		else if ( 75 > grade && grade >= 70 ) {
			return "B";
		}	
		else if ( 70 > grade && grade >= 65 ) {
			return "C+";
		}
		else if ( 65 > grade && grade >= 60 ) {
			return "C";
		}
		else if ( 60 > grade && grade >= 55 ) {
			return "D+";
		}
		else if ( 55 > grade && grade >= 50 ) {
			return "D";
		}
		else if ( 50 > grade && grade >= 45 ) {
			return "E";
		}
		else {
			return "F";
		}
	}
}

