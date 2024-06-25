import '../App.css';
import surprised from '../../images/surprised.png';

const NotFound = () => {
    return (
        <div>
            <img src={surprised} alt='Sorprendida' className='logo-spin' />
            <h1>La direccion ingresada no existe.</h1>
        </div>
    );
};

export default NotFound;