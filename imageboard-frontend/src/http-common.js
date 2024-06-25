import axios from "axios";

const imageboardBackendServer = import.meta.env.VITE_AUTOFIX_BACKEND_SERVER;
const imageboardBackendPort = import.meta.env.VITE_AUTOFIX_BACKEND_PORT;

console.log(imageboardBackendServer)
console.log(imageboardBackendPort)

export default axios.create({
    baseURL: `http://${imageboardBackendServer}:${imageboardBackendPort}`,
    headers: {
        'Content-Type': 'application/json'
    }
});