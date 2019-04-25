#isabelle andre
#15/07/18
#continue and break statement

shopping_list = ["milk", "pasta", "eggs", "span", "bread", "rice"]
for item in shopping_list:
    if item == 'span':
        continue
        #break
    print("Buy " + item)

nasty_food_item = ''

meal = ["egg","bacon","span","sausages"]
for item in meal:
    if item == 'span':
        nasty_food_item = item
        break
else:
    print("I'll have a plate of that, then, please")

if nasty_food_item:
    print("Can't I have anything without span in it")