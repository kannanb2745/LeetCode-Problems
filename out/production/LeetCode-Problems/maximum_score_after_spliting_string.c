#include <stdio.h>
#include <string.h>

int maxScore(char* s) {
    int total_nums = 0;    // Total number of '1's in the string
    int zero_count = 0;    // Count of '0's in the left part
    int one_count = 0;     // Count of '1's in the left part
    int max_number = 0;    // Maximum score
    int current = 0;       // Current score
    int length = strlen(s); // Length of the string

    for (int i = 0; i < length; i++) {
        if (s[i] == '1') {
            total_nums += 1;
        }
    }

    for (int i = 0; i < length - 1; i++) {  
        if (s[i] == '0') {
            zero_count += 1;  
        } else {
            one_count += 1;   
        }

        current = zero_count + (total_nums - one_count);

        if (current > max_number) {
            max_number = current;
        }
    }

    return max_number;
}

int main() {
    char s[] = "011101";  // Test case
    int result = maxScore(s);
    printf("The maximum score is: %d\n", result);
    return 0;
}
