import './App.css'
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import Home from './components/Home';
import Navbar from './components/Navbar';
import NotFound from './components/NotFound';

function App() {

  return (
    <Router>
      <Navbar />
      <div className='container'>
        <Routes>
          <Route path="home" element={<Home/>} />
          <Route path="*" element={<NotFound/>} />
        </Routes>
      </div>
    </Router>
  );
}

export default App
