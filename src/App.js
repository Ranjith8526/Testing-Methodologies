
import './App.css';

import Home1 from './component/homepage';
import Login from './login';
import { BrowserRouter as Router ,Routes,Route} from 'react-router-dom';
//import Signup from './component/Signup';
import Signup1 from './component/signupbackend';
import Train from './component/train';
import Admin from './component/Admin';

function App() {
  return (
    // <Admin/>
      
   <Router>
     <Routes>
      
 
       <Route path="/train" element={<Train/>}/>
      <Route path="/" element={<Login/>}/>
      <Route path="/home" element={<Home1/>}/>
      {/* <Route path="/signup" element={<Signup/>}/> */}
      <Route path="/signup1" element={<Signup1/>}/> 
      <Route path="/Admin" element={<Admin/>}/>
      

    </Routes>
  </Router>  
     
   
  );
}

export default App;
