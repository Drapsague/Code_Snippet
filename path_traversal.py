import os


def read_file(filename):
    base = "/safe/dir"
    full_path = os.path.abspath(os.path.join(base, filename))
    if not full_path.startswith(base):
        raise Exception("Path traversal attempt blocked")
    return open(full_path).read()


print(read_file("file.txt"))
