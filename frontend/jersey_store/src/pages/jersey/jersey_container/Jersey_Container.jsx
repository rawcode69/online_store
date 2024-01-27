import React from 'react'

import './jersey_container.css'

import Return from '../../../assets/return.png';
import Free_Delivery from '../../../assets/free_delivery.png';
import Express_Delivery from '../../../assets/express_delivery.png';
import Seperate_Line from './seperaet_line/Seperate_LIne';


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
                    <h1>{props.jersey_name}</h1>
                    <h2>{props.jersey_year}</h2>
                    <h3>{props.gender}</h3>
                    <h3>{props.price}</h3>
                    <div>
                        <Seperate_Line />
                    </div>

                </div>

                <div className='dw__jersey-container_right_add-to-cart'>

                    <div className='dw__jersey-container_right_size'>

                        <h2>SELECT SIZE</h2>

                        <div className='dw__size-brackets'>
                            <div className='size-S'>S</div>
                            <div className='size-M'>M</div>
                            <div className='size-L'>L</div>
                            <div className='size-XL'>XL</div>
                        </div>

                    </div>

                    <div className='dw__jersey-container_right_buttons'>
                        <div className='dw__buttons-add-to-cart'>ADD TO CART</div>

                        <div className='dw__buttons-add-to-wishlist'>ADD TO WISHLIST</div>
                    </div>

                    <div className='dw__jersey-container_right_details'>

                        <div className='dw__jersey-container_right_return-policy'>

                            <img src={Return} alt="return_image" />
                            <p>Free 30 - Day Return Policy</p>

                        </div>

                        <div className='dw__jersey-container_right_free-delivery'>

                            <img src={Free_Delivery} alt="free_delivery" />
                            <p>Free  Standard Delivery Over 7500.00</p>

                        </div>

                        <div className='dw__jersey-container_right_express-delivery'>
                            <img src={Express_Delivery} alt="express_delivery" />
                            <p>Express Delivery Available</p>
                        </div>

                    </div>

                    <Seperate_Line />


                </div>

                <div className='dw__jersey-container_right_description'>
                    <h2>DESCRIPTION</h2>
                    <p>{props.description}</p>
                    <Seperate_Line />
                </div>

                <div className='dw__jersey-container-right_delivery'>
                    <h2>DEIVLERY</h2>
                    <p>Experience swift service with our delivery timeline of 3 to 5 working days. For orders exceeding Rs. 7500.00, enjoy the added benefit of complimentary shipping</p>
                    <h2>RETURN</h2>
                    <p>We stand by our products. In case of dissatisfaction, returns are accepted within 30 days of purchase.</p>
                </div>

            </div>
        </div>
    )
}

export default Jersey_Container
