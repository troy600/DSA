from cryptography.fernet import Fernet
import os
from colorama import Fore as color
import array




with open("keyexample.key", "rb") as thekey:
    this = thekey.read()
fernet = Fernet(key=this)
class files:
    def __init__(self, encrypt):
        filename = encrypt
        with open(encrypt, "rb") as toread:
            dsafun = toread.read()
            cs = fernet.decrypt(dsafun)
            print(f"{color.GREEN} \n reading from file...")

        with open(encrypt, "wb") as toencrypt:
            print(f"{color.CYAN}\n decrypting...")
            toencrypt.write(cs)
            return print(f"{color.RED} dEcrypted successfully >:)")

true = True

filelist = []

for filelister in os.listdir():
    if filelister == "keyexample.key" or filelister.endswith(".encr"):
        continue
    filelist.append(filelister)


while true:
    print("\n possible files to encrypt", filelist)
    filenam = input(f"{color.BLUE}type the file you want to decrypt(type bye to exit) \n>>")
    if filenam == "bye":
        true = False
    if os.path.isfile(filenam):
        print(f"{color.RED} \n encrypting your file.. whatever")
        files(filenam)
    else:
        print(f"{color.RED}invalid file name perhaps use comma? lets try that again")