package home_work_3.calcs.SuperDuper;

import java.util.Arrays;

public class SortedNull {
    public void sortNull (String[] expressionArray){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = expressionArray.length - 2; i > 0; i--) {
                if (expressionArray[i] == null && expressionArray[i + 1] != null) {
                    expressionArray[i] = expressionArray[i + 1];
                    expressionArray[i + 1] = null;
                    isSorted = false;
                }
            }
        }
    }
}
