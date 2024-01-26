import React from 'react'

import './jersey_container.css'

const Jersey_Container = (props) => {
    return (
        <div className='dw__jersey-container section__margin'>

            <div className='dw__jersey-container_left'>

                <div className='dw__jersey-container_left-top'>
                    <img src={props.image_1} alt="image_1" />
                    <img src={props.image_2} alt="image_2" />
                    <img src={props.image_3} alt="image_3" />
                </div>

                <div className='dw__jersey-container_left-middle'>
                    <img src={props.image_4} alt="image_4" />
                </div>

                <div className='dw__jersey-container_left-bottom'>
                    <img src={props.image_5} alt="image_5" />
                    <img src={props.image_6} alt="image_6" />
                </div>

            </div>

            <div className='dw__jersey-container_right'>

                <div className='dw__jersey-container_right_title'>
                    <h1>MANCHESTER UNITED 2023/2024 Men/Home</h1>
                </div>

                <div className='dw__jersey-container_right_add-to-cart'>

                </div>

                <div className='dw__jersey-container_right_description'>

                </div>

                <div className='dw__jersey-container-right_delivery'>

                </div>

            </div>
        </div>
    )
}

export default Jersey_Container
