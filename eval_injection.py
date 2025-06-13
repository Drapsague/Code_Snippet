def safe_eval(expr):
    allowed_names = {"__builtins__": {}}
    return eval(expr, allowed_names)


print(safe_eval("1 + 2"))
