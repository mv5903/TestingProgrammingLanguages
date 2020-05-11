#include <stdio.h>
#include <string>
#include <iostream>
#include <ctime>
#include <ratio>
#include <chrono>

using namespace std;
using namespace std::chrono;

void calculate(int times, int num) {
	bool isPrime = false;
	string output = "";
	for (int i = 2; i < num; i++) {
		isPrime = true;
		for (int j = 2; j < num; j++) {
			if (i % j == 0 && j != i) {
				isPrime = false;
			}
		}
		if (isPrime) {
			output += std::to_string(i);
			output += ", ";
		}
	}
	cout << output;
} 

int main() {
	int num, times;
	cout << "Enter the number to go up to: ";
	cin >> num;
	cout << "How many times?";
	cin >> times;
	high_resolution_clock::time_point t1 = high_resolution_clock::now();
	for (int i = 0; i < times; i++) {
		calculate(times, num);
	}
	high_resolution_clock::time_point t2 = high_resolution_clock::now();
	duration<double, std::milli> time_span = t2 - t1;
	std::cout << "Total time: " << time_span.count() << "ms, averaging " << time_span.count()/times << "ms each.";
	return 0;
}


