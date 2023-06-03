
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManager from "./components/listers/ReservationCards"
import ReservationDetail from "./components/listers/ReservationDetail"
import UserPreferenceManager from "./components/listers/UserPreferenceCards"
import UserPreferenceDetail from "./components/listers/UserPreferenceDetail"

import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import VehicleManager from "./components/listers/VehicleCards"
import VehicleDetail from "./components/listers/VehicleDetail"

import VoicePromptManager from "./components/listers/VoicePromptCards"
import VoicePromptDetail from "./components/listers/VoicePromptDetail"

import AccessibilityInfoManager from "./components/listers/AccessibilityInfoCards"
import AccessibilityInfoDetail from "./components/listers/AccessibilityInfoDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },
            {
                path: '/reservations/:id',
                name: 'ReservationDetail',
                component: ReservationDetail
            },
            {
                path: '/userPreferences',
                name: 'UserPreferenceManager',
                component: UserPreferenceManager
            },
            {
                path: '/userPreferences/:id',
                name: 'UserPreferenceDetail',
                component: UserPreferenceDetail
            },

            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/vehicles',
                name: 'VehicleManager',
                component: VehicleManager
            },
            {
                path: '/vehicles/:id',
                name: 'VehicleDetail',
                component: VehicleDetail
            },

            {
                path: '/voicePrompts',
                name: 'VoicePromptManager',
                component: VoicePromptManager
            },
            {
                path: '/voicePrompts/:id',
                name: 'VoicePromptDetail',
                component: VoicePromptDetail
            },

            {
                path: '/accessibilityInfos',
                name: 'AccessibilityInfoManager',
                component: AccessibilityInfoManager
            },
            {
                path: '/accessibilityInfos/:id',
                name: 'AccessibilityInfoDetail',
                component: AccessibilityInfoDetail
            },



    ]
})
