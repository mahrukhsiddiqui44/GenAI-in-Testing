# 🟦 4. Prompt:
Explain what this Python function does:

python
Copy
Edit
def is_valid_email(email):
    return '@' in email and '.' in email
# 🔶 Output:
markdown
Copy
Edit
This function checks if the email address contains both '@' and '.'  
If both are found, it returns `True`, otherwise `False`.

✅ Example: is_valid_email("test@gmail.com") → True  
❌ Example: is_valid_email("testgmailcom") → False
