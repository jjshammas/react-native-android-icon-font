"use strict";

var React = require("react-native");

var {
    requireNativeComponent,
    Text
} = React;

var IconAndroid = requireNativeComponent("IconAndroid", Icon);

var ICON_REF = "androidIcon";

class Icon extends React.Component {

    constructor() {
        super();
    }

    render() {
        return (
            <IconAndroid
                {...this.props}
                ref={ICON_REF}
                />
        );
    }

}

Icon.propTypes = {
    ...Text.propTypes
};

module.exports = Text;
