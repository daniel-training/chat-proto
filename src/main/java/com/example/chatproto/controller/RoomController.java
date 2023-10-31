package com.example.chatproto.controller;


import com.example.chatproto.model.Message;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;


@Controller
public class RoomController {



    @MessageMapping("/chat/{room}")
    @SendTo("/topic/{room}")
    public Message inboundMessage(@DestinationVariable String room, Message message) throws Exception {
        return new Message( String.format("[%s] %s", message.getUser(), HtmlUtils.htmlEscape(message.getContent())),
                message.getUser(),
                room
        );
    }



}
