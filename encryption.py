from cryptography.fernet import Fernet

SecretKey = "LWaPBG8pG-AJcuU2moJacS_N00_qxCScFEp4Z7wsqmA="

fernet = Fernet(key=SecretKey)

message = input("Insert a message>>")

PlainText = bytes(message, "UTF-8")

cyphertext = fernet.encrypt(PlainText)

print(f"{message} Encrypted text are:\n")
print(cyphertext, "\n")

print(f"{cyphertext} decrypted message are:\n")
print(fernet.decrypt(cyphertext))
