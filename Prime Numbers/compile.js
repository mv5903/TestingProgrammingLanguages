const prompt = require('prompt-sync')(); //IMPORTANT! 
                                         //PLEASE RUN 'npm install prompt-sync' IN THE DIRECTORY YOU ARE EXECUTING THIS PROGRAM FROM BEFORE RUNNING!

var number = prompt("Enter a number: ");
var times = prompt("How many times? ");

function primes(number, times) {
	var d = new Date();
	var milistart = d.getTime();
	var isPrime = false;
	var output = "";
	for (var i = 2; i < number; i++) {
		isPrime = true;
		for (var j = 2; j < number; j++) {
			if (i % j == 0 && j != i) {
				isPrime = false;
			}
		}
		if (isPrime) {
			output+=i;
			output+=", ";
		}
	}
	var nd = new Date();
	return nd.getTime() - milistart;
}

var start = 0;

for (var i = 0; i < times; i++) {
	start+=primes(number, times);
	console.log(i);
}

console.log("Took a total of " + start + "ms, averaging " + start/times + "ms each."); 


