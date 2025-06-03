<<<<<<< HEAD
import os

def main():
  path_files = "D:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Programación - Bazan Mendez Argimira Maria Guadalupe\\Diagramas\\Pseint\\Problemario"

  path_notes = "D:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Programación - Bazan Mendez Argimira Maria Guadalupe\\Diagramas\\Notas"

  path_act_file = "D:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Programación - Bazan Mendez Argimira Maria Guadalupe\\Notas\\Actividades y Tareas.md"
  act_file_data = "# Actividades y Tareas\n"

  for i in os.listdir(path_files):
    act_file_data = act_file_data + f"## {i}\n"

    if not os.path.exists(path_notes + f"\\{i}"):
      os.mkdir(path_notes + f"\\{i}")

    for e in os.listdir(path_files + f"\\{i}\\"):

      file_name = e.replace('.psc', '.md')
      file_title = e.replace('.psc', '')
      file_path = path_notes + f"\\{i}\\{file_name}"
      original_file_path = path_files + f"\\{i}\\{e}"

      act_file_data = act_file_data + f"### [[{file_title}]]\n- [[{file_title}.psc]]\n"

      with open(original_file_path, "r") as file_r:
        file_data = file_r.read()
      file_r.close()

      with open(file_path, "w") as file_w:
        file_w.write(f"# {file_title}\n~~~pseint\n{file_data}\n~~~")
      file_w.close()

  with open(path_act_file, "w") as act_file:
    act_file.write(act_file_data)
  act_file.close()

if __name__ == "__main__":
  main()
=======
import os

def main():
  path_files = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Programación - Bazan Mendez Argimira Maria Guadalupe\\Diagramas\\Pseint\\Problemario"

  path_notes = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Programación - Bazan Mendez Argimira Maria Guadalupe\\Diagramas\\Notas"

  path_act_file = "E:\\Documentos\\Notas_ITO\\Primer Semestre\\Fundamentos de Programación - Bazan Mendez Argimira Maria Guadalupe\\Notas\\Actividades y Tareas.md"
  act_file_data = "# Actividades y Tareas\n"

  for i in os.listdir(path_files):
    act_file_data = act_file_data + f"## {i}\n"

    if not os.path.exists(path_notes + f"\\{i}"):
      os.mkdir(path_notes + f"\\{i}")

    for e in os.listdir(path_files + f"\\{i}\\"):

      file_name = e.replace('.psc', '.md')
      file_title = e.replace('.psc', '')
      file_path = path_notes + f"\\{i}\\{file_name}"
      original_file_path = path_files + f"\\{i}\\{e}"

      act_file_data = act_file_data + f"### [[{file_title}]]\n- [[{file_title}.psc]]\n"

      with open(original_file_path, "r") as file_r:
        file_data = file_r.read()
      file_r.close()

      with open(file_path, "w") as file_w:
        file_w.write(f"# {file_title}\n~~~pseint\n{file_data}\n~~~")
      file_w.close()

  with open(path_act_file, "w") as act_file:
    act_file.write(act_file_data)
  act_file.close()

if __name__ == "__main__":
  main()
>>>>>>> 2e762fd9b358a1d81084f63e43da99e86ef2847d
