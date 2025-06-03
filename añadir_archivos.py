<<<<<<< HEAD
import os, shutil

path = "E:\\Documentos\\Notas_ITO\\"
dir  = ""
def list_dir(_path : str):
    global dir
    num = 0
    for item in os.listdir(_path):
        num = num + 1
        if os.path.isdir(item):
            item = item  + "/"
        print(f"{num} - {item}")

    dir = os.listdir(path)[int(input("Numero: \n")) - 1]

    if os.path.isdir(dir):
        list_dir(path + f"\\{dir}\\")
    else:
        print(dir)

def main():
    list_dir(path)


if __name__ == "__main__":
    main()
=======
import os, shutil

path = "E:\\Documentos\\Notas_ITO\\"
dir  = ""
def list_dir(_path : str):
    global dir
    num = 0
    for item in os.listdir(_path):
        num = num + 1
        if os.path.isdir(item):
            item = item  + "/"
        print(f"{num} - {item}")

    dir = os.listdir(path)[int(input("Numero: \n")) - 1]

    if os.path.isdir(dir):
        list_dir(path + f"\\{dir}\\")
    else:
        print(dir)

def main():
    list_dir(path)


if __name__ == "__main__":
    main()
>>>>>>> 2e762fd9b358a1d81084f63e43da99e86ef2847d
