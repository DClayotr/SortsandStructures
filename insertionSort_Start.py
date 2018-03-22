def sort(List):
	curNum = 0
	for i in range(1, len(List)):
		curNum = List[i]
		buffer = i - 1
		while buffer >= 0:
			if curNum < List[buffer]:
				List[buffer+1] = List[buffer]
				List[buffer] = curNum
				buffer = buffer - 1
				print List
			else:
				break
		
	print List

array = [4,7,5,3,8,1,2,0,12,7,5,7,5,4,3,21,2,34,5,6,78,9,6,54,3,2,1,2,3,4,5,6,78,9,0,7,4,3,5,6,4,2,3,4,6,7,8,3456,3756,78678,0,2346,46,812,3457,85,1345,345,1,1345,6,24356,23452456,]
sort(array)