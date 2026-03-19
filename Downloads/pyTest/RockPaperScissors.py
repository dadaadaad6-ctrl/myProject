import random

moves = ["rock", "paper", "scissors"]

player_score = 0
ai_score = 0

def get_ai_move():
    return random.choice(moves)

def determine_winner(player, ai):
    if player == ai:
        return "tie"
    elif (player == "rock" and ai == "scissors") or \
         (player == "paper" and ai == "rock") or \
         (player == "scissors" and ai == "paper"):
        return "player"
    else:
        return "ai"

print("Welcome to Rock Paper Scissors!")

while True:
    player_move = input("Enter rock, paper, or scissors or 'quit': ").lower()

    if player_move == "quit":
        print("Game over!")
        break

    if player_move not in moves:
        print("Invalid move, try again.")
        continue

    ai_move = get_ai_move()

    print("AI chose:", ai_move)

    result = determine_winner(player_move, ai_move)

    if result == "player":
        print("You win this round!")
        player_score += 1
    elif result == "ai":
        print("AI wins this round!")
        ai_score += 1
    else:
        print("It's a tie!")

    print("Score -> You:", player_score, "| AI:", ai_score)
    print("-" * 20)