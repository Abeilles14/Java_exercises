#isabelle andre
#16/07/18
#while loops

import random

# i = 0
# while i < 10:
#     print("i is now {}".format(i))
#     i += 1
#
# exits = ["east", "north east", "south"]
# chosen = ""
# while chosen not in exits:
#     chosen = input("Please choose a direction: ")
#     if chosen == "quit":
#         print("Game Over")
#         break
#     else:
#         print("You got out")

highest = 18
answer = random.randint(1, highest)

while guess != answer:
    print("Please guess a number between 1 and {}: ".format(highest))
    guess = int(input())
    if guess != answer:
        if guess < answer:
            print("Guess higher")
        elif guess > answer:
            print("Guess lower")
        else:
            print("You guessed it!")
