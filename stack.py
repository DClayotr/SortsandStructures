import sys

def Push(stack):
	x = str(raw_input("> "))
	stack.insert(0, x)
	
def POP(stack):
	x = stack[0]
	print x
	

def main():
	bool = True
	stack = [1,2,3]
	while bool == True:
		Push(stack)
		POP(stack)
		ask = raw_input("continue?\n >")
		if ask == "yes":
			continue
		elif ask == "no":
			print ask
			#bool = False
		else: 	
			break
main()			