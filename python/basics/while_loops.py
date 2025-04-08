# a while loop performs a condition multiple times provided a condition is true
# i =0
# j=10
# while i<10:
#     print("*"*i)
#     i +=1
# Guessing game

# secret_number =8
# answer_found =False
# tries =3
# while answer_found==False and tries >0:
#     my_answer =int(input("Enter your guess: "))
#     if my_answer ==secret_number:
#         answer_found=True
#         print(f"You found the answer")
#     else:
#         tries -=1
#         print(f"you are wrong!! you have {tries} remaining ")
# if tries ==0 and answer_found==False:
#     print("Game over!!You lose")

has_started =False
has_stopped =True
quit_game =False

print("####### Welcome to the car game #######")
print("#######Commands#######")
print("Enter\n(start) to start \n(stop) to stop vehicle\n(h) for help")
while not quit_game:
    user_input = input("|> ").lower()
    print(user_input)
    if user_input == "start":
        if not has_started:
            has_started = True
            has_stopped = False
            print("starting the car...")
            print("Car has started")
        else:
            print("car had already started")
    elif user_input == "stop":
        if has_started:
            has_started=False
            has_stopped=True
            print("stopping car...")
            print("Car has stopped")
        else:
            print("car had already stopped")
    elif user_input =="quit":
        print("you quit the Game")
        quit_game =True
    elif user_input =="h":
        print("Enter\n(start) to start \n(stop) to stop vehicle\n(h) for help")
    else:
        print("I don't understand that")
        print("Enter\n(start) to start \n(stop) to stop vehicle\n(h) for help")






