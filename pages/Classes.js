import {Card, Row} from "antd";
import "./pages-style.css"

export default function Classes() {
    return (

        <div>

            <div style={{
                display: "flex",
                alignContent: "center",
                alignItems: "center"
            }}>
                <h1 style={{
                    fontFamily: "-moz-initial"
                }}>Classes</h1>
            </div>

            <hr width="100%"/>

            <div className="centered-card" style={{marginTop: '20px'}}>
                <Card title="Barbarian" style={{
                    marginRight: '40px',
                    marginLeft: '40px'
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Bard" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Cleric" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Druid" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Fighter" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Monk" style={{
                    marginRight: ' 40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>
            </div>

            <div className="centered-card" style={{marginTop: '20px'}}>

                <Card title="Paladin" style={{
                    marginRight: '40px',
                    marginLeft: '40px'
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Ranger" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Rogue" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Sorcerer" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Fighter" style={{
                    marginRight: '40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>

                <Card title="Monk" style={{
                    marginRight: ' 40px',
                }}>
                    <p>
                        This is the content of the card
                    </p>
                </Card>
            </div>

        </div>
    )
        ;
}