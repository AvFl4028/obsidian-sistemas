<<<<<<< HEAD
#!/usr/bin/env python
# -*- coding utf-8 -*-

import os

def main():
  path_file = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Investigación - Hernandez Flores Rita\\Notas\\Tareas.md"
  path_pdf = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Investigación - Hernandez Flores Rita\\Tareas\\"

  with open(path_file, "w") as file:
    file.write("# Tareas")
    for item in os.listdir(path_pdf):
      file.write(f"\n - [[{item}]]")
    file.close()

if __name__ == "__main__":
=======
#!/usr/bin/env python
# -*- coding utf-8 -*-

import os

def main():
  path_file = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Investigación - Hernandez Flores Rita\\Notas\\Tareas.md"
  path_pdf = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Investigación - Hernandez Flores Rita\\Tareas\\"

  with open(path_file, "w") as file:
    file.write("# Tareas")
    for item in os.listdir(path_pdf):
      file.write(f"\n - [[{item}]]")
    file.close()

if __name__ == "__main__":
>>>>>>> 2e762fd9b358a1d81084f63e43da99e86ef2847d
  main()