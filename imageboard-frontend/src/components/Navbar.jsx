import { AppBar, Box, Button, Toolbar, Typography } from "@mui/material";
import DarkMode from '@mui/icons-material/DarkMode';

export default function Navbar({ toggleTheme }) {

    return (
        <Box sx={{ flexGrow: 1 }}>
            <AppBar position="static">
                <Toolbar>
                    <Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
                        UwUchan
                    </Typography>
                    <Button color="inherit" onClick={toggleTheme} startIcon={<DarkMode />}>
                    </Button>
                </Toolbar>
            </AppBar>
        </Box>
    );
}