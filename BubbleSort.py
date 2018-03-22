my_list = [4,7,5,3,8,1,2,0,12]
def bubble(bad_list):
	length = len(bad_list) - 1
	sorted = False
	while not sorted:
		sorted = True
		for i in range(length):
			if bad_list[i] > bad_list[i+1]:
				sorted = False
				bad_list[i], bad_list[i+1] = bad_list[i+1], bad_list[i]
				print i
bubble(my_list)
print my_list