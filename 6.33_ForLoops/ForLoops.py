#isabelle andre
#14/07/18
#for loops

# for i in range(0,20):
#     print("i is now {}".format(i))
#
# number = "9,223,372,036,854,775,807"
# for i in range(0, len(number)):      #len =  how many chara in a string
#     print(number[i])
#
# cleanedNumber = ' '
# for i in range(0, len(number)):
#     if number[i] in '0123456789':     #prints all numbers
#         #print(number[i], end = '')     #overwrites \n, same line
#         cleanedNumber = cleanedNumber + number[i]
#
# newNumber = int(cleanedNumber)
# print("The number is {}".format(newNumber))         #converted into int


############

number = "9,223,372,036,854,775,807"
cleanedNumber = ' '
for char in number:             #extract character in every position
    if char in '0123456789':
        cleanedNumber = cleanedNumber + char

newNumber = int(cleanedNumber)
print("The number is {}".format(newNumber))

for state in ["not pinin'","no more", "a stiff", "bereft of lift"]:     #prints sentence + list
    print("This parrot is " + state)

for i in range(0,100,5):            #from 0-100, steps of 55
    print("i is {} ".format(i))

for i in range(1,13):
    for j in range(1,13):
        print("{1} times {0} is {2}".format(i,j,i*j), end='\t')         #add tab at the end of line
        #print("**************")
        print('')
