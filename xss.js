function render(userInput) {
    const safe = document.createElement('div');
    safe.textContent = userInput; 
    document.body.appendChild(safe);
}

render('<img src=x onerror=alert(1)>'); 

