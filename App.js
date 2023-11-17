import BattleGround from "./pages/BattleGround";
import CharacterCreation from "./pages/CharacterCreation";
import Home from "./pages/Home";
import GameRules from "./pages/GameRules";
import Classes from "./pages/Classes";
import Spells from "./pages/Spells";
import Races from "./pages/Races";
import Monsters from "./pages/Monsters";
import Equipment from "./pages/Equipment";
import MagicItems from "./pages/MagicItems";
import Feats from "./pages/Feats";
import Vehicles from "./pages/Vehicles";
import {Route, Routes, useNavigate} from "react-router-dom"
import {Menu} from "antd";
import {
    HomeOutlined,
    UserAddOutlined,
    RadarChartOutlined,
    ReadOutlined
} from "@ant-design/icons/lib/icons";

function App() {
    return (
            <div style={{display: "flex",
                flexDirection: "column",
                flex: 1,
                height: "100vh",
            }}>
                <Header/>
                <div style={{display: "flex", flexDirection: "row", flex: 1}}>
                    <SideMenu/>

                    <Content/>


                </div>
                <Footer/>
            </div>
    );

    function Header(){
        return <div style={{
            height:60,
            backgroundColor: "lightblue",
            display: 'flex',
            justifyContent:'center',
            alignItems:'center',
            fontWeight: 'bold',

        }}>Header</div>
    }

    function Footer(){
        return <div style={{
            height:60,
            backgroundColor: "lightgrey",
            display: 'flex',
            justifyContent:'center',
            alignItems:'center',
            fontWeight: 'bold',

        }}>Header</div>
    }

}

function SideMenu() {
    const navigate = useNavigate()
    return(
        <Menu
            onClick={({key}) => {
                navigate(key)
            }}

            defaultSelectedKeys={[window.location.pathname]}

            items={[
                {label:
                        "Home",
                    key: "/",
                    icon: <HomeOutlined/>
                },
                {label:
                        "Character Creation",
                    key: "character-creation",
                    icon: <UserAddOutlined/>
                },
                {label: "Game Rules",
                    key: "game-rules",
                    icon: <ReadOutlined/>,
                    children: [
                        {label: 'Classes', key:'/classes'},
                        {label: 'Races', key:'/races'},
                        {label: 'Monsters', key:'/monsters'},
                        {label: 'Vehicles', key:'/vehicles'},
                        {label: 'Equipment', key:'/equipment'},
                        {label: 'Magic Items', key:'/magic-items'},
                        {label: 'Feats', key:'/feats'}]
                },
                {label: "Battle Ground",
                    key: "battle-ground",
                    icon: <RadarChartOutlined/>},
            ]}>
        </Menu>

    );

}


function Content() {
    return <div>

        <Routes>
            <Route path="/" element={<Home/>}/>
            <Route path="/battle-ground" element={<BattleGround/>}/>
            <Route path="/classes" element={<Classes/>}/>
            <Route path="/spells" element={<Spells/>}/>
            <Route path="/races" element={<Races/>}/>
            <Route path="/monsters" element={<Monsters/>}/>
            <Route path="/feats" element={<Feats/>}/>
            <Route path="/equipment" element={<Equipment/>}/>
            <Route path="/magic-items" element={<MagicItems/>}/>
            <Route path="/vehicles" element={<Vehicles/>}/>
            <Route path="/character-creation" element={<CharacterCreation/>}/>
            <Route path="/game-rules" element={<GameRules/>}/>
        </Routes>

    </div>

}

export default App;
