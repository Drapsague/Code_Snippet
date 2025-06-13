#include <iostream>
#include <memory>

void handleData() {
    std::unique_ptr<char[]> data(new char[10]);
    strcpy(data.get(), "safe");
    std::cout << data.get() << std::endl;
}

int main() {
    handleData();
}

