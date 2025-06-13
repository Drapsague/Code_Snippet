package main

import (
    "fmt"
    "net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
    user := r.URL.Query().Get("user")
    safeUser := http.CanonicalHeaderKey(user) 
    w.Header().Set("X-User", safeUser) 
    fmt.Fprintf(w, "Hello, %s", safeUser)
}

func main() {
    http.HandleFunc("/", handler)
    http.ListenAndServe(":8080", nil)
}

