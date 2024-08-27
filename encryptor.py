from cryptography.fernet import Fernet
import os
from colorama import Fore as color





if os.path.exists("keyexample.key"):
    print(f"{color.BLUE}foreign key detected!! \n")
else:
    print("\n no key detected generating one for you")

    with open("keyexample.key", "wb") as keymake:
        keymake.write(key)





class files:
    def __init__(self, encrypt):
        filename = encrypt
        with open(encrypt, "rb") as toread:
            dsafun = toread.read()
            cs = fernet.encrypt(dsafun)
            print(f"{color.GREEN} \n reading from file...")

        with open(encrypt, "wb") as toencrypt:
            print(f"{color.CYAN}\n encrypting...")
            toencrypt.write(cs)
            return print(f"{color.RED} Encrypted successfully >:)")

true = True

filelist = []

for filelister in os.listdir():
    if filelister == "keyexample.key" or filelister.endswith(".encr"):
        continue
    filelist.append(filelister)


while true:
    print("\n possible files to encrypt", filelist)
    filenam = input(f"{color.BLUE}type the file you want to encrypt(type bye to exit) \n>>")
    if filenam == "bye":
        true = False
    if os.path.isfile(filenam):
        print(f"{color.RED} \n encrypting your file.. whatever")
        files(filenam)
    else:
        print(f"{color.RED}invalid file name perhaps use comma? lets try that again")