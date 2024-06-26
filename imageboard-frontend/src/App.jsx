import './App.css'
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import { lightTheme, darkTheme} from './themes'
import Home from './components/Home';
import Navbar from './components/Navbar';
import NotFound from './components/NotFound';
import { useState } from 'react';
import { Box, CssBaseline, ThemeProvider } from '@mui/material';

function App() {
  const [theme, setTheme] = useState(lightTheme);

  const toggleTheme = () => {
    setTheme((prevTheme) => (prevTheme.palette.mode === 'light' ? darkTheme : lightTheme));
  };

  return (
    <ThemeProvider theme={theme}>
      <CssBaseline />
      <Router>
        <Navbar toggleTheme={ toggleTheme }/>
        <Box className="container" sx={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center' }}>
          <Routes>
            <Route path="home" element={<Home/>} />
            <Route path="*" element={<NotFound/>} />
          </Routes>
        </Box>
      </Router>
    </ThemeProvider>
  );
}

export default App
