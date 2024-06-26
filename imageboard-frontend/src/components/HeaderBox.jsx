import React from 'react';
import { Box, Typography } from '@mui/material';

const HeaderBox = ({ title, children }) => {
    return (
        <Box
            border={1}
            p={2}
            m={2}
            bgcolor="background.paper"
        >
            <Typography variant='h6' component="h2" gutterBottom>
                {title}
            </Typography>
            {children}
        </Box>
    );
};

export default HeaderBox;