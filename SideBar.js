import "./style.css";
import { Link, useMatch, useResolvedPath } from "react-router-dom";

export default function Sidebar() {
    return (
        <div className="sidebar">
            <div className="open-button" onClick={openSidebar}>
                &#9776;
            </div>
            <div className="sidebar-content">
                <Link to="/" className="site-title">
                    Home Page
                </Link>
                <ul>
                    <CustomLink to="/game-rules">Game Rules</CustomLink>
                    <CustomLink to="/battle-ground">Battle Ground</CustomLink>
                    <CustomLink to="/character-creation">Character Creation</CustomLink>
                </ul>
            </div>
        </div>
    );
}

function openSidebar() {
    const sidebar = document.querySelector(".sidebar");
    sidebar.style.width = "250px";
}

function CustomLink({ to, children, ...props }) {
    const resolvedPath = useResolvedPath(to);
    const isActive = useMatch({ path: resolvedPath.pathname, end: true });

    return (
        <li className={isActive ? "active" : ""}>
            <Link to={to} {...props}>
                {children}
            </Link>
        </li>
    );
}



