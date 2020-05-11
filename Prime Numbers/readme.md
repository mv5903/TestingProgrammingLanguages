# Prime Numbers up to 10000, ran 50 times:

| Language                   	| Total (ms) 	| Average (ms) 	|
|----------------------------	|------------	|--------------	|
| C++                        	| 11237      	| 224.74       	|
| Java                       	| 12149      	| 242          	|
| Python                     	| 440340     	| 8806.8       	|
| JavaScript(Node in CMD)    	| 53302      	| 1066.04      	|
| JavaScript(Chrome w/ HTML) 	| 50386      	| 1007.72      	|

#### Algorithm Used (Java Example):
```Java
public static int primeNums(int times, int num) {
	long timeStart = System.nanoTime(); //time in nanoseconds
	String output = "";
	boolean isPrime = false;
	for (int i = 2; i < num; i++) {
		isPrime = true;
		for (int j = 2; j < num; j++) {
			if (j % i == 0 && j != i) {
				isPrime = false;
			}
		}
		if (isPrime) {
			output+=isPrime + ", ";
		}
	}
	System.out.println(output);
	return (int) (System.nanoTime() - timeStart) / 1000000; //converts from nanoseconds to milliseconds
}
```
+ This was then ran 50 times in a for loop, constantly adding to a number which shows the total time at the end of a program.
+ Additionally, it is divided by 50 to get an average.

#### Notes:

+ Obviously, I don't know all these languages as well as I do with Java! Efficieny was not my top priority, however I tried my
best to translate from Java to all the other languages.
+ With the exception of JS(Chrome), every program was ran with Command Prompt in Windows 10.
+ Laptop Specs: i7-8550U, 16GB RAM, 256GB PCIe NVMe SSD, GTX 1050Ti 4GB.
+ See all the files contained within this zip to see code!
	
