#isabelle andre
#16/07/18
#program flow challenge

segments = 1
length = 0
address = input("Enter an IP address: ")        #4 numbers separated by period
if address[-1] != ".":                          #takes care of last segment if not ended by "."
    address += "."
char = ""                                       #if no IP address entered

for char in address:
    if char == ".":
        print("Segment {} is {} digits long".format(segments, length))
        segments += 1
        length = 0
    else:
        length += 1

# if char != ".":                                     #takes care of last segment if not ended by "."
#     print("Segment {} is {} digits long".format(segments, length))