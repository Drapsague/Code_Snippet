#include <stdio.h>
#include <string.h>

void safeCopy(const char *input) {
    char buffer[16];
    snprintf(buffer, sizeof(buffer), "%s", input); 
    printf("Copied: %s\n", buffer);
}

int main() {
    safeCopy("Short string");
    return 0;
}

