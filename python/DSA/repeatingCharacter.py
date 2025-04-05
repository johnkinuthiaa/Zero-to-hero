# Today's Challenge: Find the First Repeated Character in a String
# Write a function that returns the first repeated character in a given string. If there’s no repeated character, return None.
# Example: first_repeated_char("hello") returns "l" and first_repeated_char

# The function iterates over each character in the string. If it encounters a character that is already in the dictionary, it returns that character. If it doesn’t encounter any repeated characters,

 # The function iterates over each character in the string. If it encounters a character that is already
# in the dictionary, it returns that character. If it doesn’t encounter any repeated characters,

def first_repeated_char(s):
    char_count = {}
    for char in s:
        if char in char_count:
            return char  # Return the first repeated character
        char_count[char] = True
    return None  # If no character repeats, return None

# Get input from the user
user_input = input("Enter a string: ")
result = first_repeated_char(user_input)

# Print the result
if result:
    print(f"The first repeated character is: '{result}'")
else:
    print("No repeated characters found.")

   