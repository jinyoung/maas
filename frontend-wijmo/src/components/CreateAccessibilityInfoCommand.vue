<template>

    <v-card outlined>
        <v-card-title>
            CreateAccessibilityInfo
        </v-card-title>

        <v-card-text>
            <String label="TransportationType" v-model="value.transportationType" :editMode="editMode"/>
            <Boolean label="IsAccessible" v-model="value.isAccessible" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createAccessibilityInfo"
            >
                CreateAccessibilityInfo
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateAccessibilityInfoCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.transportationType = '';
            this.value.isAccessible = false;
        },
        watch: {
        },
        methods: {
            createAccessibilityInfo() {
                this.$emit('createAccessibilityInfo', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

