#isabelle andre
#17/07/18
#lists

ipAddress = input("Enter an IP address: ")
print(ipAddress.count("."))                 #counts how many times "."

parrot_list = ("non pinin'", "no more", "a stiff","bereft of live")

parrot_list.apend("A Norwegian Blue")           #adds entry to list

for state in parrot_list:
    print("This parrot is " +state)

even = [2, 4, 6, 8]
odd = [1, 3, 5, 7, 9]

numbers = even + odd                #adds up both lists
numbers.sort                        #sorts from smallest to largest
print(numbers)
#print(sorted(numbers))             #same as numbers.sort

order = sorted(numbers)
print(order)

if numbers == order:
    print("The lists are equal")

#######

list1 = []                               #empty lists
list2 = list()

print("List 1: {}".format(list1))
print("List 2: {}".format(list2))

if list1 == list2:
    print("The lists are equal")

print(list("The lists are equal"))         #makes list with chars

even = [2, 4, 6, 8]
#even2 = even                      #even2 and even are same lists
even2 = list(even)                 #even2 and even are different lists
even2.sort(reverse=True)
print(even)

numbers = [even, odd]
print(numbers)

for sets in numbers:            #2 lists
    print(sets)
    for digits in sets:         #prints each digit in list
        print(digits)

###########

menu = []
menu.append(["egg", "spam", "bacon"])
menu.append(["egg", "sausage", "bacon"])
menu.append(["egg", "spam"])
menu.append(["egg", "bacon", "spam"])
menu.append(["egg", "bacon", "sausage", "spam"])
menu.append(["spam", "egg", "spam", "spam", "bacon", "spam"])
menu.append(["spam", "egg", "sausage", "spam"])

print(menu)
for meal in menu:
    if not "spam" in meal:
        for item in meal:
            print(item)
