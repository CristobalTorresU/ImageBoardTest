import { Box, Table, TableBody, TableHead } from "@mui/material";
import HeaderBox from "./HeaderBox";

const Home = () => {
    return (
        <Box
            display="flex"
            flexDirection="column"
            alignItems="center"
            justifyContent="center"
            height="100vh"
        >
            <Box
                width="800px"
                height="350px"
                bgcolor="#FFFFFF"
                display="flex"
                alignItems="center"
                justifyContent="center"
                m={2}
            >
                <HeaderBox title="sexoo">
                    <p>sexu</p>
                </HeaderBox>
            </Box>
            <Box
                width="800px"
                height="350px"
                bgcolor="#FFFFFF"
                display="flex"
                alignItems="center"
                justifyContent="center"
                m={2}
            >
                Cajita 2
            </Box>
            <Box
                width="800px"
                height="350px"
                bgcolor="#FFFFFF"
                display="flex"
                alignItems="center"
                justifyContent="center"
                m={2}
            >
                Cajita 3
            </Box>
        </Box>

    );
};

export default Home;