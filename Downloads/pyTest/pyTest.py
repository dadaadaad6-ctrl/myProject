name = input("Hello, I am an AI bot, what is your name: ")
print(f"Nice to meet you, {name.lower()} \n")

age = input("How old are you: ")
print(f"You are {age} years old\n")

feeling = input("How are you feeling: ")

if feeling.upper() == "GOOD":
    print("That's nice to hear!\n")
elif feeling.upper() == "BAD":
    print("That's sad to hear\n")
elif feeling.upper()=="FINE":
    print("Hope you get better!\n")
else:
    print("I see. Sometimes it's hard to put feelings into words\n")

print(f"It was nice meeting you, {name.lower()}. Goodbye!")

