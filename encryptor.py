#!/usr/bin/python

#from BSDSA

from cryptography.fernet import Fernet
import os
from colorama import Fore as color
import argparse
from pathlib import Path

parser = argparse.ArgumentParser(description="simple ass encryption tool")

parser.add_argument("--encrypt", type=str, help="filename to encrypt")
parser.add_argument("--decrypt", type=str, help="decryption method")
parser.add_argument("--keygen", action="store_true", help="generate a ney key store it on ~/.config/keyfile")

args = parser.parse_args()

home = Path.home()

if args.keygen == True:
    if os.path.exists(f"{home}/.config/keyfile"):
        print(f"{color.RED} are you sure you want to create a new key? (deleting the old key in process) y/n")
        yn = input("\n>>")
        if yn == "y":
                with open(f"{home}/.config/keyfile.key", 'wb') as keyfile:
                    keyfile.write(Fernet.generate_key())
                    print("bye bye old key")
                    exit
        elif yn == "n":
            print("bye")
            exit
        else:
            print("invalid mh")
            exit

    print(f"{color.BLUE} creating the key!! \n sucessful")
    with open(f"{home}/.config/keyfile.key", 'wb') as keyfile:
        keyfile.write(Fernet.generate_key())
    exit

with open(f"{home}/.config/keyfile.key", "rb") as thekey:
    this = thekey.read()
fernet = Fernet(key=this)
class files_encrypt:
    def __init__(self, encrypt):
        if os.path.isfile(f"encrypt") == False:
            print(f"{color.RED} file didn't exists exiting safely")
            exit
        with open(encrypt, "rb") as toread:
            dsafun = toread.read()
            cs = fernet.encrypt(dsafun)
            print(f"{color.GREEN} \n reading from file...")

        with open(encrypt + ".wncry", "wb") as toencrypt:
            print(f"{color.CYAN}\n encrypting...")
            toencrypt.write(cs)
            os.remove(encrypt)
            return print(f"{color.RED} encrypted successfully >:)")

class file_decrypt:
    def __init__(self, decrypt):
        with open(decrypt, 
        "rb") as toread:
            dsa = toread.read()
            decrypting = fernet.decrypt(dsa)
            noextensionencryptedfile = deletext(decrypt)
        with open (noextensionencryptedfile, "wb") as todecrypt:
            todecrypt.write(decrypting)
            os.remove(decrypt)

def deletext(filenames):
    name, extension = os.path.splitext(filenames)

    while extension:
        filename = name
        name, extension = os.path.splitext(filename)
        return filename

#files_encrypt(f"{args.encrypt}")
if args.decrypt != None:
    file_decrypt(f"{args.decrypt}")

if args.encrypt != None:
    files_encrypt(f"{args.encrypt}")


true = True
