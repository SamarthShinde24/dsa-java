class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int circularPreferences = 0;
        int squarePreferences = 0;

        for (int student : students) {
            if (student == 0) {
                circularPreferences++;
            } else {
                squarePreferences++;
            }
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (circularPreferences > 0) {
                    circularPreferences--;
                } else {
                    break;
                }
            } else { 
                if (squarePreferences > 0) {
                    squarePreferences--;
                } else {
                    break;
                }
            }
        }

            return circularPreferences + squarePreferences;
    }
 }
