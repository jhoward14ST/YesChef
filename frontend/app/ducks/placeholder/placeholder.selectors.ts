import { pathOr } from "ramda";

import { namespace } from "./placeholder.slice";

const getPlaceholder = pathOr({}, namespace);   

export default {
    getPlaceholder,
};