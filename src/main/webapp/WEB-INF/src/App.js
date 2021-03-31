import React from 'react'

function App() {
  return (
    <div  id = 'heading'>
        <h1>Login to the Help Desk</h1>
        <span>User Name:</span>
        <input id = 'centerUN'/> <br /><br />
        <span >Password:</span>
        <input id = 'centerUP' type="password"/> <br /><br />
        <input type="submit" value="Enter" id = 'button'/>
    </div>
  );
}

export default App;
