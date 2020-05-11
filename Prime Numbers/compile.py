import time



def primeNums(limit):
	output = ""
	start = int(round(time.time() * 1000))
	limit = int(limit)
	isPrime = True
	for i in range(2, limit):
		isPrime = True
		for j in range(2, limit):
			if i % j == 0 and i != j:
				isPrime = False
		if isPrime:
			output+=str(i) + ", "
	
	print(output)
	return (int(round(time.time() * 1000)) - start)
	
			
		
limit = input("Enter a number")
print(" ")
howMany = input("How many times?")
howMany = int(howMany)
avgTime = 0
for i in range(0, howMany):
	avgTime+=int(primeNums(limit))

print("Total time: " + str(avgTime) + "ms, averaging " + str(avgTime/howMany) + "ms")
