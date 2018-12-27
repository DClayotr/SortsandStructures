def LinearSearch(x, key):
	i = 0
	found = False
	while i <= len(x) - 1:
		if x[i] == key:
			found = True
			break
			
		else:
			i += 1
			continue
	
	if found == True:
		print "Found: " + str(key) + "\nAt position: " + str(i)
		
	else: 	
		print "Item not found"
	
def main():
	
	Array = ["p", "O", "9", "Hi", "909", "foo"]
	n = str(raw_input("Enter a key to search for: "))
	LinearSearch(Array, n)
		
	
main()
